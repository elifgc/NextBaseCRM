package test.filterSearch_functionality;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.LoginPage;
import page.LogoutPage;
import test.TestBase;
import utilities.Driver;
import utilities.ExcelUtil;

public class SearchWithItem extends TestBase {

    @DataProvider
    public Object[][] userData(){
        ExcelUtil nextUser = new ExcelUtil("src/test/resources/NextBaseCRM.xlsx","Sayfa1");
        String[][] dataArray =nextUser.getDataArrayWithoutFirstRow();
        return dataArray;
    }

    @Test(dataProvider = "userData")
    public void searchWithItem(String userName,String password){
        LoginPage login= new LoginPage();
        login.login(userName,password);





        LogoutPage logout = new LogoutPage();
        logout.logOut();
    }



}
