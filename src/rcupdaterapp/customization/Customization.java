package rcupdaterapp.customization;

public class Customization {
	//The String from the build.prop before the Version
    public static final String RO_MOD_START_STRING = "RCMod ";
	//Minimum Supported Version (So the User has to install google apps and so before)
    public static final String MIN_SUPPORTED_VERSION_STRING = RO_MOD_START_STRING + "";
	//Updateinstructions for the min supported Version
	public static final String UPDATE_INSTRUCTIONS_URL = "http://wiki.cyanogenmod.com/index.php/Upgrading_From_Older_CyanogenMod_or_other_rooted_ROMs";
    //DB filename
    public static final String DATABASE_FILE = "cmupdater.db";
    //DownloadDirectory
    public static final String DOWNLOAD_DIR = "download";
	//MUST be the first package name.
    public static final String PACKAGE_FIRST_NAME = "rcupdaterapp";
	//Filename for Instance save
    public static final String STORED_STATE_FILENAME = "rcupdater.state";
	//Android Board type
    public static final String BOARD = "ro.product.board";
	//Name of the Current Rom
	public static final String SYS_PROP_MOD_VERSION = "ro.modversion";
	//Screenshotsupport?
    public static final Boolean Screenshotsupport = false;
}
