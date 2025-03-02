package pmt.appdata;

import java.util.ArrayList;
import java.util.List;
import pmt.User;
public class AppData {
    public static List<User> usersList;
    public static List<User> loggedInUser; 
    public static List<User> initUsers() {
        usersList = new ArrayList<>(); 
        return usersList; 
    }
	public static List<User> getUsersList() {
		return usersList;
	}
	public static void setUsersList(List<User> usersList) {
		AppData.usersList = usersList;
	}
	public static List<User> getLoggedInUser() {
		return loggedInUser;
	}
	public static void setLoggedInUser(List<User> loggedInUser) {
		AppData.loggedInUser = loggedInUser;
	}
}
