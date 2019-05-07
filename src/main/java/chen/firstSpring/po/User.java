package chen.firstSpring.po;

import java.util.Date;

public class User {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

    public int getStatus_flag() {
        return status_flag;
    }

    public void setStatus_flag(int status_flag) {
        this.status_flag = status_flag;
    }

    public Date getServer_create_time() {
        return server_create_time;
    }

    public void setServer_create_time(Date server_create_time) {
        this.server_create_time = server_create_time;
    }

    public Date getServer_update_time() {
        return server_update_time;
    }

    public void setServer_update_time(Date server_update_time) {
        this.server_update_time = server_update_time;
    }
    
    private int id;
    private String  code;
    private String  name;
    private String  login_name;
    private String  password;
    private int  status;
    private int  is_admin;
    private int  status_flag;
    private Date  server_create_time;
    private Date server_update_time;




}
