public class User {
    private String userId;
    private String userName;
    private String userPassword;

    public User(String userId, String userName, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public String userInfo() {
        return userId + "," + userName + "," + userPassword;
    }

    @Override
    public String toString() {
        return "userId : " + userId + "," + " userName : " + userName + "," + " userPassword " + userPassword;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
