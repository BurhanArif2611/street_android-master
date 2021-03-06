package com.revauc.revolutionbuy.util;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static com.revauc.revolutionbuy.util.Constants.EnterType.EDIT_PICKS;
import static com.revauc.revolutionbuy.util.Constants.EnterType.ENTER;
import static com.revauc.revolutionbuy.util.Constants.EnterType.RE_ENTER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 *
 */
public class Constants {

    public static final String ERROR_UNSUPPORTED_SIZE = "UNSUPPORTED MEDIA SIZE";
    public static final String ERROR_CANNOT_UPLOAD = "Image size cannot exceeds 10 MB";
    public static final String EXTRA_FACEBOOK_TOKEN = "FACEBOOK_TOKEN";
    public static final String EXTRA_LEAGUE_TYPE = "LEAGUE_TYPE";
    public static final int ITEM_TYPE_SEPARATOR = 2;
    public static final String EXTRA_POLLING_REQUIRED = "POLLING_REQUIRED";
    public static final String EXTRA_SHOULD_ACCEPT = "SHOULD_ACCEPT";
    public static final String INTENT_ACTION_PLAYER_DISABLED = "com.revauc.revolutionbuy.playerdisable";
    public static final String EXTRA_CITY_ID = "CITY_ID";
    public static final String EXTRA_AGE = "AGE";
    public static final String EXTRA_MOBILE = "MOBILE";
    public static final String EXTRA_CATEGORY = "EXTRA_CATEGORY";
    public static final String EXTRA_PRODUCT_ID = "EXTRA_PRODUCT_ID";
    public static final String EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION";
    public static final String EXTRA_PRODUCT_DETAIL = "EXTRA_PRODUCT_DETAIL";
    public static final String EXTRA_PROFILE_IMAGE = "EXTRA_PROFILE_IMAGE";
    public static final String EXTRA_CATEGORY_NAME = "EXTRA_CATEGORY_NAME";
    public static final String EXTRA_CATEGORY_SOCIAL_PROFILE = "EXTRA_CATEGORY_SOCIAL_PROFILE";

    //SELLER STATES
    public static final int STATE_OFFER_SENT = 1;
    public static final int STATE_ITEM_REMOVED_BY_BUYER = 2;
    public static final int STATE_BUYER_ACCEPTED_OTHER_OFFER = 3;
    public static final int STATE_BUYER_ACCEPTED_MY_OFFER = 4;
    public static final int STATE_ITEM_SOLD_TO_BUYER = 5;

    //REQUEST CODES
    public static final int REQUEST_CODE_ENTER_APP = 2241;
    public static final int REQUEST_CODE_BUYER_PRODUCT_DELETE = 2242;
    public static final int REQUEST_CODE_SELLER_PRODUCT_DELETE = 2243;
    public static final int REQUEST_CODE_LOGOUT = 2244;
    public static final int REQUEST_CODE_CONFIRM_PAY = 2245;

    //NOTIFICATION TYPES
    public static final int TYPE_OFFER_SENT = 1;
    public static final int TYPE_BUYER_UNLOCKED = 2;
    public static final int TYPE_BUYER_MARKED_COMPLETE = 3;
    public static final int TYPE_PRODUCT_SOLD_BY_ANOTHER = 4;
    public static final int TYPE_SELLER_MARKED_COMPLETE = 5;
    public static final String EXTRA_IS_BUYER = "IS_BUYER";
    public static final String EXTRA_CURRENCY_NAME = "EXTRA_CURRENCY";

    public static String BROAD_PICKS_ENTER_COMPLETE = "BROAD_PICKS_ENTER_COMPLETE";
    public static String CONTEST_CANCELLED = "CANCELLED";
    public static final String EXTRA_PHONE_CODE = "PHONE_CODE";

    public static final int REQUEST_CODE_CHOOSER = 1005;
    public static final String EXTRA_LOCATION_VALUE = "LOCATION_VALUE";


    private Constants() {
    }

    public static final int SELECTED_UNDER = 1;
    public static final int SELECTED_OVER = 2;
    public static final int SELECTED_NONE = 0;

    public static final String EXTRA_CHOOSE_TYPE = "CHOOSE_TYPE";
    public static final String EXTRA_FROM_SETTINGS = "FROM_SETTINGS";
    public static final String EXTRA_STATE_ID = "EXTRA_STATE_ID";
    public static final String EXTRA_COUNTRY_ID = "EXTRA_COUNTRY_ID";
    public static final String EXTRA_USER_RANK = "EXTRA_USER_RANK";
    public static final String EXTRA_USER_NAME = "EXTRA_USER_NAME";
    public static final String EXTRA_CONTEST_ID = "EXTRA_CONTEST_ID";
    public static final String EXTRA_USER_CONTEST_ID = "EXTRA_USER_CONTEST_ID";
    public static final String EXTRA_OPPONENT_USER_CONTEST_ID = "EXTRA_OPPONENT_USER_CONTEST_ID";
    public static final String EXTRA_IS_FROM_PROFILE = "EXTRA_IS_FROM_PROFILE";
    public static final String EXTRA_CONTEST_TYPE = "EXTRA_CONTEST_TYPE";
    public static final String EXTRA_CONTEST_NAME = "EXTRA_CONTEST_NAME";
    public static final String EXTRA_CONTEST = "EXTRA_CONTEST";
    public static final String EXTRA_FACEBOOK_EMAIL = "FACEBOOK_EMAIL";
    public static final String EXTRA_LATITUDE = "LATITUDE";
    public static final String EXTRA_LONGITUDE = "LONGITUDE";
    public static final String EXTRA_PRICE = "Price";
    public static final String EXTRA_SORT_SELECTED = "SORT_SELECTED";
    public static final String EXTRA_IS_FEATURED_SELECTED = "FEATURED_SELECTED";
    public static final String EXTRA_ENTERIES = "ENTERIES";
    public static final String EXTRA_PRICE_CONTEST = "ENTERIES_PRICE";
    public static final String EXTRA_PLAYER = "EXTRA_PLAYER";
    public static final String EXTRA_PLAYER_TEAM = "EXTRA_PLAYER_TEAM_NAME";
    public static final String EXTRA_EMAIL = "EXTRA_EMAIL";
    public static final String EXTRA_NOTIFICATION = "extra_notification";

    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    public static final String EXTRA_MESSSAGE = "EXTRA_MESSAGE";
    public static final String EXTRA_RESULT_NEEDED = "EXTRA_RESULT_FLAG";
    public static final String EXTRA_IS_MULTIPLE_ENTRIES_ALLOWED = "IS_MULTIPLE_ENTRIES_ALLOWED";

    public static final int ERRORCODE_EMAIL_REQUIRED = 1;
    public static final int ERRORCODE_USERNAME_REQUIRED = 2;
    public static final int ERRORCODE_USERNAME_EXISTS = 3;

    public static final int PASSWORD_MIN_LENGTH = 6;
    public static final int USER_NAME_MIN_LENGTH = 6;
    public static final int FIRST_NAME_MIN_LENGTH = 2;

    public static final int CHOOSE_TYPE_COUNTRY = 1;
    public static final int CHOOSE_TYPE_STATE = 2;
    public static final int CHOOSE_TYPE_CITY = 3;

    public static final String LOGIN_FACEBOOK = "Facebook";
    public static final String LOGIN_EMAIL = "Email";
    public static final String TYPE_LOGIN = "Login";
    public static final String TYPE_SIGNUP = "SignUp";

    public static final String DEVICE_TYPE_ANDROID = "ANDROID";


    public static final String HOME = "Home";
    public static final String AWAY = "AWAY";

    //EEE dd MMM yyyy HH:mm:ss z
    public static final String DATE_FORMAT_SERVER = "yyyy-MM-dd HH:mm";//2017-05-15 11:22 AM GMT
    public static final String DATE_FORMAT_SERVER_STATS = "yyyy-MM-dd'T'HH:mm:ss";//2017-05-15 11:22 AM GMT

    //to display Sun, 20 Feb, 2017 | 6:00pm - 7:00pm
    public static final String DATE_FORMAT_DAY = "EEEE, MMM d$$, yyyy";// Sun, 20 Feb, 2017
    public static final String DATE_FORMAT_STATS = "MMM d$$, yyyy";// Sun, 20 Feb, 2017
    public static final String DATE_FORMAT_PICKS = "MMM d$$, yyyy | hh:mma";// Sun, 20 Feb, 2017 | 6:00pm
    public static final String DATE_FORMAT_EVENT_STATUS = "hh:mma";// Sun, 20 Feb, 2017
    public static final String DATE_FORMAT_TIME = "hh:mma";// 6:00pm
    public static final String DATE_FORMAT_TIME_SPACE = "hh:mm a";// 6:00 pm

    public enum ACTIVITIES {
        SWITCH_ACTIVITY
    }

    public enum FRAGMENTS {
        FEED_FRAGMENTS
    }

    public interface BundleKey {
        String LAYOUT_ID = "layoutResId";
        String INDEX = "INDEX";
    }

    public interface REQUEST_CODE {
        int REQUEST_CODE_LOGIN = 100;
        int FILTER_REQUEST_CODE = 101;
        int REQUEST_GALLERY = 102;
        int REQUEST_CAMERA = 103;
        int REQUEST_CODE_VOICE_SEARCH = 104;
        int REQUEST_CODE_FIRST_LOGIN = 105;

        int REQUEST_CODE_WRITE_SD_CARD = 200;
        int REQUEST_CODE_LOCATION_ACCESS = 201;
        int REQUEST_CODE_READ_PHONE_STATE = 202;
        int REQUEST_CODE_JOYRIDE = 203;
    }



    @Retention(SOURCE)
    @IntDef({ENTER, RE_ENTER, EDIT_PICKS})
    public @interface EnterType {
        int ENTER = 0;
        int RE_ENTER = 1;
        int EDIT_PICKS = 2;
    }


}
