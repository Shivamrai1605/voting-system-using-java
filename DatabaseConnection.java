import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    // Database URL, username, and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/voting_system"; // Change the database name if needed
    private static final String DB_USER = "your_db_username"; // Replace with your database username
    private static final String DB_PASSWORD = "your_db_password"; // Replace with your database password

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Method to register a user
    public static void registerUser (String username, String email, String password) {
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, password); // In a real application, hash the password
            pstmt.executeUpdate();
            System.out.println("User  registered successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to validate user login
    public static boolean validateUser (String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password); // In a real application, hash the password
            ResultSet rs = pstmt.executeQuery();
            return rs.next(); // Returns true if a user is found
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        // Example usage
        registerUser ("JohnDoe", "johndoe@example.com", "password123");
        boolean isValidUser  = validateUser ("johndoe@example.com", "password123");
        System.out.println("Is valid user: " + isValidUser );
    }
}