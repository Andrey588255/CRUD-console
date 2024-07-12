package org.example.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface

public interface ResultSetParser<T>{
    T parse(ResultSet resultSet) throws SQLException;
}
