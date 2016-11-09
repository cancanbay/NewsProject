package tr.edu.anadolu.admin.dao;

import tr.edu.anadolu.admin.models.News;

import java.io.PrintWriter;
import java.sql.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static java.io.FileDescriptor.out;

public class NewsDAO {
    //Date date, after string title
    public static void insertNews(String title, String description, String detail, String category, String image) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        ps = connection.prepareStatement("INSERT INTO haber(title,description, detail, category, image) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, detail);
        ps.setString(4, category);
        ps.setString(5, image);
        ps.executeUpdate();
        connection.close();
    }

    public List<News> listNews() throws SQLException, ClassNotFoundException {
        List<News> list = new LinkedList<>();
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM haber ORDER BY  category ASC ");

        while (resultSet.next()) {
            News news = new News(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
            list.add(news);
        }
        connection.close();
        return list;
    }

    public List<News> listNewsQuery(String wherequery) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM haber WHERE category";
        List<News> list = new LinkedList<>();
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query+wherequery);

        while (resultSet.next()) {
            News news = new News(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
            list.add(news);
        }
        connection.close();
        return list;
    }

    public News getStudentById(int id ) throws SQLException,ClassNotFoundException{
        News news = new News();
        Connection connection = DBConnection.getConnection();
        String query="SELECT * FROM haber WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,id);

        ResultSet set = statement.executeQuery();
        while(set.next()) {
            news.setId(set.getInt("id"));
            news.setTitle(set.getString("title"));
            news.setDescription(set.getString("description"));
            news.setDetail(set.getString("detail"));
            news.setCategory(set.getString("category"));
            news.setImage(set.getString("image"));
        }
        return news;
    }

    public void editNews(News news) throws  SQLException,ClassNotFoundException{
        NewsDAO newsDAO=new NewsDAO();
        Connection connection = DBConnection.getConnection();
        String query="UPDATE haber SET title=? , description=? , detail=? , category=? , image=? WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,news.getTitle());
        preparedStatement.setString(2,news.getDescription() );
        preparedStatement.setString(3, news.getDetail());
        preparedStatement.setString(4, news.getCategory());
        preparedStatement.setString(5, news.getImage());
        preparedStatement.setInt(6,news.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void deleteNews(int newsid)  throws SQLException,ClassNotFoundException {
        try {
            Connection connection = DBConnection.getConnection();
            String query = "DELETE FROM haber WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,newsid);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
