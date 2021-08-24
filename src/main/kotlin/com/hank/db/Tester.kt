package com.hank.db

import java.sql.DriverManager

fun main() {
    val conn = DriverManager.getConnection("jdbc:mariadb://localhost/demo", "root", "abc123")
    val stmt = conn.createStatement()
    val rs = stmt.executeQuery("select * from cars where id='ABC-1234'")
    while(rs.next()) {
        println(rs.getString("id"))
        println(rs.getLong("enter"))
    }
    rs.close()
    stmt.close()
    conn.close()
    /*val success = stmt.executeUpdate(
        "insert into cars values('DDD-1234', 1232222400, 0)");
    println(success)*/
    /*val resultSet = stmt.executeQuery("show databases")
    while(resultSet.next()) {
        println(resultSet.getString("Database"))
    }*/
}