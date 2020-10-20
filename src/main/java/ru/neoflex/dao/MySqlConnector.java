package ru.neoflex.dao;

import ru.neoflex.model.cost.Price;

import java.sql.*;

public class MySqlConnector {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testimony?useUnicode=true&serverTimezone=UTC", "root", "148192");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static ResultSet selectAllFromBilling(String currentMonth) throws SQLException {
        return getConnection().createStatement().executeQuery("SELECT * FROM billing_period WHERE currentmonth = " + currentMonth);
    }

    public static ResultSet selectAllFromHistory(String prevMonth) throws SQLException {
        return getConnection().createStatement().executeQuery("SELECT * FROM testimony_history WHERE previous_month = " + prevMonth);
    }

    public static int getCountFromGuide(Price price) throws SQLException {
        ResultSet set = getConnection().createStatement().executeQuery("SELECT count(*) as total FROM price_guide "
                + "WHERE priceColdWater = " + price.getPriceColdWater()
                + " and priceHotWater = " + price.getPriceHotWater()
                + " and priceGas = " + price.getPriceGas()
                + " and priceElectricity = " + price.getPriceElectricity());
        set.next();
        return set.getInt("total");
    }
}
