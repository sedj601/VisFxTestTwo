module sed.test.visfxtesttwo {
    requires javafx.controls;
    requires javafx.web;
    
    requires com.google.gson;
    
    opens visfx.graph to com.google.gson;
    opens sed.test.visfxtesttwo to com.google.gson;
    
    exports sed.test.visfxtesttwo;
}
