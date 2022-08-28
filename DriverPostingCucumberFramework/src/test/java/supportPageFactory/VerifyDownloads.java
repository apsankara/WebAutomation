package supportPageFactory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.WaitHelper;

public class VerifyDownloads {
	public WebDriver driver;
	WaitHelper waithelper;
	
	//Constructor, as every page needs a Web driver to find elements
		public VerifyDownloads(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,30);
			PageFactory.initElements(factory, this);
			waithelper=new WaitHelper(driver);
		}
	
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		          dirContents[i].delete();
		          return true;
		      }
		          }
		      return false;
		  }
	
	public static void waitUntilFileToDownload(String folderLocation, String filename) throws InterruptedException {
        File directory = new File(folderLocation);
        boolean downloadinFilePresence = false;
        File[] filesList =null;
        LOOP:   
            while(true) {
                filesList =  directory.listFiles();
                for (File file : filesList) {
                    downloadinFilePresence = file.getName().contains(filename);
                }
                if(downloadinFilePresence) {
                    for(;downloadinFilePresence;) {
                        Thread.sleep(10000);
                        continue LOOP;
                    }
                }else {
                    break;
                }
            }
    }
	
}
