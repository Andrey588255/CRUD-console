package org.example.utils;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@FunctionalInterface
public interface PrepStSetter {
    void setUp(PreparedStatement prepSt) throws SQLException;
}
