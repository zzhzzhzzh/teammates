package teammates.ui.webapi.output;

import javax.annotation.Nullable;

import teammates.common.datatransfer.UserInfo;

/**
 * Authentication request format.
 */
public class AuthInfo extends ApiOutput {

    @Nullable
    private final String studentLoginUrl;
    @Nullable
    private final String instructorLoginUrl;
    @Nullable
    private final String adminLoginUrl;
    @Nullable
    private final UserInfo user;
    private final boolean masquerade;
    @Nullable
    private final String logoutUrl;

    public AuthInfo(String studentLoginUrl, String instructorLoginUrl, String adminLoginUrl) {
        this.studentLoginUrl = studentLoginUrl;
        this.instructorLoginUrl = instructorLoginUrl;
        this.adminLoginUrl = adminLoginUrl;
        this.user = null;
        this.masquerade = false;
        this.logoutUrl = null;
    }

    public AuthInfo(UserInfo user, boolean masquerade, String logoutUrl) {
        this.studentLoginUrl = null;
        this.instructorLoginUrl = null;
        this.adminLoginUrl = null;
        this.user = user;
        this.masquerade = masquerade;
        this.logoutUrl = logoutUrl;
    }

    public String getStudentLoginUrl() {
        return studentLoginUrl;
    }

    public String getInstructorLoginUrl() {
        return instructorLoginUrl;
    }

    public String getAdminLoginUrl() {
        return adminLoginUrl;
    }

    public UserInfo getUser() {
        return user;
    }

    public boolean isMasquerade() {
        return masquerade;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

}