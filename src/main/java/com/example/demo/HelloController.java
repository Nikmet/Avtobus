package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Book;

    @FXML
    private TextField Name;

    @FXML
    public Button _1;

    @FXML
    public Button _10;

    @FXML
    public Button _11;

    @FXML
    public Button _12;

    @FXML
    public Button _13;

    @FXML
    public Button _14;

    @FXML
    public Button _15;

    @FXML
    public Button _16;

    @FXML
    public Button _17;

    @FXML
    public Button _18;

    @FXML
    public Button _19;

    @FXML
    public Button _2;

    @FXML
    public Button _20;

    @FXML
    public Button _21;

    @FXML
    public Button _22;

    @FXML
    public Button _23;

    @FXML
    public Button _24;

    @FXML
    public Button _25;

    @FXML
    public Button _3;

    @FXML
    public Button _4;

    @FXML
    public Button _5;

    @FXML
    public Button _6;

    @FXML
    public Button _7;

    @FXML
    public Button _8;

    @FXML
    public Button _9;

    @FXML
    private Button del;

    private Button currentBut;
    private String currentNum;


    public Button RET1(String name) {
        if (name.equals("1")) {
            return (_1);
        } else if (name.equals("2")) {
            return (_2);
        } else if (name.equals("3")) {
            return (_3);
        } else if (name.equals("4")) {
            return (_4);
        } else if (name.equals("5")) {
            return (_5);
        } else if (name.equals("6")) {
            return (_6);
        } else if (name.equals("7")) {
            return (_7);
        } else if (name.equals("8")) {
            return (_8);
        } else if (name.equals("9")) {
            return (_9);
        } else if (name.equals("10")) {
            return (_10);
        } else if (name.equals("11")) {
            return (_11);
        } else if (name.equals("12")) {
            return (_12);
        } else if (name.equals("13")) {
            return (_13);
        } else if (name.equals("14")) {
            return (_14);}
        else if (name.equals("15")) {
            return (_15);}
        else if (name.equals("16")) {
            return (_16);}
        else if (name.equals("17")) {
            return (_17);}
        else if (name.equals("18")) {
            return (_18);}
        else if (name.equals("19")) {
            return (_19);}
        else if (name.equals("20")) {
            return (_20);}
        else if (name.equals("21")) {
            return (_21);}
        else if (name.equals("22")) {
            return (_22);}
        else if (name.equals("23")) {
            return (_23);}
        else if (name.equals("24")) {
            return (_24);}
        else if (name.equals("25"))
        {return(_25);
        }
        else{return null;}

    }

    @FXML
    void getName1(MouseEvent event) {
        currentBut = _1;
        currentNum = "1";
        inAction();
    }

    @FXML
    void getName10(MouseEvent event) {
        currentBut = _10;
        currentNum = "10";
        inAction();
    }

    @FXML
    void getName11(MouseEvent event) {
        currentBut = _11;
        currentNum = "11";
        inAction();
    }

    @FXML
    void getName12(MouseEvent event) {
        currentBut = _12;
        currentNum = "12";
        inAction();
    }

    @FXML
    void getName13(MouseEvent event) {
        currentBut = _13;
        currentNum = "13";
        inAction();
    }

    @FXML
    void getName14(MouseEvent event) {
        currentBut = _14;
        currentNum = "14";
        inAction();
    }

    @FXML
    void getName15(MouseEvent event) {
        currentBut = _15;
        currentNum = "15";
        inAction();
    }

    @FXML
    void getName16(MouseEvent event) {
        currentBut = _16;
        currentNum = "16";
        inAction();
    }

    @FXML
    void getName17(MouseEvent event) {
        currentBut = _17;
        currentNum = "17";
        inAction();
    }

    @FXML
    void getName18(MouseEvent event) {
        currentBut = _18;
        currentNum = "18";
        inAction();
    }

    @FXML
    void getName19(MouseEvent event) {
        currentBut = _19;
        currentNum = "19";
        inAction();
    }

    @FXML
    void getName2(MouseEvent event) {
        currentBut = _2;
        currentNum = "2";
        inAction();
    }

    @FXML
    void getName20(MouseEvent event) {
        currentBut = _20;
        currentNum = "20";
        inAction();
    }

    @FXML
    void getName21(MouseEvent event) {
        currentBut = _21;
        currentNum = "21";
        inAction();
    }

    @FXML
    void getName22(MouseEvent event) {
        currentBut = _22;
        currentNum = "22";
        inAction();
    }

    @FXML
    void getName23(MouseEvent event) {
        currentBut = _23;
        currentNum = "23";
        inAction();
    }

    @FXML
    void getName24(MouseEvent event) {
        currentBut = _24;
        currentNum = "24";
        inAction();
    }

    @FXML
    void getName25(MouseEvent event) {
        currentBut = _25;
        currentNum = "25";
        inAction();
    }

    @FXML
    void getName3(MouseEvent event) {
        currentBut = _3;
        currentNum = "3";
        inAction();
    }

    @FXML
    void getName4(MouseEvent event) {
        currentBut = _4;
        currentNum = "4";
        inAction();
    }

    @FXML
    void getName5(MouseEvent event) {
        currentBut = _5;
        currentNum = "5";
        inAction();
    }

    @FXML
    void getName6(MouseEvent event) {
        currentBut = _6;
        currentNum = "6";
        inAction();
    }

    @FXML
    void getName7(MouseEvent event) {
        currentBut = _7;
        currentNum = "7";
        inAction();
    }

    @FXML
    void getName8(MouseEvent event) {
        currentBut = _8;
        currentNum = "8";
        inAction();
    }

    @FXML
    void getName9(MouseEvent event) {
        currentBut = _9;
        currentNum = "9";
        inAction();
    }

    public void inAction(){
        del.setVisible(true);
        Book.setVisible(true);
        Name.setVisible(true);
        Name.setText(RET1(currentBut.getText()).getText());
        RET1(currentBut.getText()).setStyle("-fx-background-color: #0000FF");
    }


    public void Booking(){
        RET1(currentBut.getText()).setStyle("-fx-background-color: #FF0000");
        RET1(currentBut.getText()).setText(Name.getText());
        Name.clear();
        del.setVisible(false);
        Book.setVisible(false);
        Name.setVisible(false);
    }

    public void Delete() {
        currentBut.setStyle("-fx-background-color: #00FF00");
        currentBut.setText(currentNum);
        Name.clear();
        del.setVisible(false);
        Book.setVisible(false);
        Name.setVisible(false);
    }

    @FXML
    void initialize() {
        assert Book != null : "fx:id=\"Book\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Name != null : "fx:id=\"Name\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _1 != null : "fx:id=\"_1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _10 != null : "fx:id=\"_10\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _11 != null : "fx:id=\"_11\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _12 != null : "fx:id=\"_12\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _13 != null : "fx:id=\"_13\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _14 != null : "fx:id=\"_14\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _15 != null : "fx:id=\"_15\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _16 != null : "fx:id=\"_16\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _17 != null : "fx:id=\"_17\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _18 != null : "fx:id=\"_18\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _19 != null : "fx:id=\"_19\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _2 != null : "fx:id=\"_2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _20 != null : "fx:id=\"_20\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _21 != null : "fx:id=\"_21\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _22 != null : "fx:id=\"_22\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _23 != null : "fx:id=\"_23\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _24 != null : "fx:id=\"_24\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _25 != null : "fx:id=\"_25\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _3 != null : "fx:id=\"_3\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _4 != null : "fx:id=\"_4\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _5 != null : "fx:id=\"_5\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _6 != null : "fx:id=\"_6\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _7 != null : "fx:id=\"_7\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _8 != null : "fx:id=\"_8\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert _9 != null : "fx:id=\"_9\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert del != null : "fx:id=\"del\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
