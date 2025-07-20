package org.banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
    SavingsAccount savingsAccount = new SavingsAccount();
    public boolean saveCustomer(Customer customer) throws SQLException {
        String sql = "Insert into customer(id,name,email,phoneNumber,accountNumber,accountType,balance) values (?,?,?,?,?,?,?)";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement prtmt = connection.prepareStatement(sql)) {
            prtmt.setString(1, customer.getCustomerId());
            prtmt.setString(2, customer.getName());
            prtmt.setString(3, customer.getEmail());
            prtmt.setLong(4, customer.getPhoneNumber());
            prtmt.setString(5, customer.getAccountNumber());
            prtmt.setString(6, customer.getAccountType());
            prtmt.setDouble(7, savingsAccount.getBalance());

            int rowInserted = prtmt.executeUpdate();
            return rowInserted > 0;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
