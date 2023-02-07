import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends PageBase {

	public TasksListPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id="com.tasks.android:id/action_add_task")
	MobileElement addTaskBtn;
	
	public void clickAddTaskBtn()
	{
		click(addTaskBtn);
	}
	
}
