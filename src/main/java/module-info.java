module br.com.gustavomendeslima.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;

    
    opens br.com.gustavomendeslima.dukemarket.javafx.controller to javafx.fxml;
    opens br.com.gustavomendeslima.dukemarket.javafx to javafx.fxml;
          
    exports br.com.gustavomendeslima.dukemarket.javafx;
    exports br.com.gustavomendeslima.dukemarket.javafx.controller;
            
    exports br.com.gustavomendeslima.dukemarket.javafx.DAO;
    exports br.com.gustavomendeslima.dukemarket.javafx.model;
    exports connection;
    
    requires mysql.connector.java;
    
    
    
}
