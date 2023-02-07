import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase {

	public CreateTaskPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		
	}
	
	@AndroidFindBy(id="com.tasks.android:id/task_title")
	MobileElement AddTask;
	
	@AndroidFindBy(id="com.tasks.android:id/notes")
	MobileElement AddNotes;
	
	
	@AndroidFindBy(id="com.tasks.android:id/fab")
	MobileElement Savebtn;
	
	public void EnterTask(String taskname)
	
	{
		clear(AddTask);
		sendText(AddTask,taskname);
	}
	
public void EnterNotes(String notesname)
	
	{
		clear(AddNotes);
		sendText(AddNotes,notesname);
	}

public void clickSaveBtn()
{
	click(Savebtn);
}
}
