package BootCamp.AutomationProjects;

import org.testng.annotations.Test;

import Common.Utility;
import PageObjectModel.hDepotCreate1;
import PageObjectModel.hDepotCreate2;
import PageObjectModel.hDepotHome;

public class HomeDepot extends Utility {

  @Test
  public void f() throws InterruptedException {
	  hDepotHome ob= new hDepotHome(driver);
	  Thread.sleep(3000);
	  ob.AcctBtnClick();
	  Thread.sleep(3000);
	  ob.RegBtnClick();
	  Thread.sleep(3000);
	  
	  hDepotCreate1 obj= new hDepotCreate1(driver);
	  obj.PersonalAcctClick();
	  Thread.sleep(3000);
	  
	  hDepotCreate2 ot= new hDepotCreate2(driver);
	  ot.EmailSendkeys();
	  ot.PassSendkeys();
	  ot.ZipSendkeys();
	  ot.PhoneSendkeys();
	  Thread.sleep(3000);
	  ot.CreateClick();
	  Thread.sleep(3000);
  }
}
