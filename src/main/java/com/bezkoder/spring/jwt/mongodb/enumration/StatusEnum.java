package com.bezkoder.spring.jwt.mongodb.enumration;

public enum StatusEnum {
    SUCCESS(200,"SUCCESS"),
    FAIL(500,"FAIL"),

    AUTH_ACCESS_DENIED(201,"Invalid access token"),
    AUTH_EXCEPTION(202,"Auth Exception"),
    AUTH_REFRESH_TOKEN_ERROR(203,"Auth refresh token Exception"),
    AUTH_ACCESS_TOKEN_NOT_RECOGNISED(204,"Access token not  recognised"),
    AUTH_ACCESS_TOKEN_HAS_EXPIRED(205,"Access token has expired"),
    AUTH_RRFRESH_TOKEN_INVALID(206,"Invalid refresh token"),
    AUTH_RRFRESH_TOKEN_HAS_EXPIRED(207,"Invalid refresh token (expired)"),

    /** Account**/
    ACCOUNT_ROLE_ALREADY_EXIST(1001,"AccountRole已存在"),
    ACCOUNT_NOT_EXIST(1002,"Account不存在"),
    ROLE_NOT_EXIST(1003,"Role不存在"),
    ACCOUNT_ROLE_NOT_EXIST(1004,"Account和Role不存在"),
    ACCOUNT_ALREADY_EXIST(1005,"帳號已存在"),
    /** Chat**/
    /** Menu**/
    MENU_ALREADY_EXIST(1006,"選單已存在"),
    MENU_NOT_EXIST(1007,"選單不存在"),

    /** PushInfo**/
    PUSH_INFO_INSERT_FAIL(1008,"推送資訊新增失敗"),
    PUSH_INFO_ALREADY_EXIST(1009,"推送資訊已存在"),
    PUSH_INFO_NOT_EXIST(1010,"推送資訊不存在"),
    /** Role**/
    ROLE_ALREADY_EXIST(1011,"Role已存在"),
    ROLE_ROLE_MENU_ALREADY_EXIST(1012,"角色所屬選單已存在"),
    ROLE_MENU_ID_NOT_EXIST(1013,"選單不存在"),
    ROLE_ROLE_ID_NOT_EXIST(1014,"角色不存在"),
    /** Platfrom**/
    PLATFORM_ALREADY_EXIST(1015,"平台已存在"),
    PLATFORM_NOT_EXIST(1016,"平台不存在"),
    PLATFORM_INSERT_FAIL(1017,"平台新增失敗"),

    /** Token**/
    /** User**/
    USER_INSERT_FAIL(1509,"使用者新增失敗"),
    USER_EMPTY_USERNAME(1510,"使用者昵稱為空"),
    USER_NOT_EXIST(1511,"使用者資料不存在"),
    USER_EXIST(1512,"使用者資料己存在"),
    USER_FIND_BY_UID_ERROR(1513,"findByUid錯誤"),
    USER_NOT_AVAILIBLE(1514,"使用者非啟用中"),
    USER_CATCHA_WRONG(1515,"註冊證證碼錯誤"),
    USER_PASSWORD_WRONG(1516,"帳號密碼錯誤"),
    USER_AUTH_CODE_WRONG(1517,"碼證碼錯誤"),
    USER_NO_AUTH_CODE(1518,"無碼證碼錯誤"),
    USER_NO_IDENTITY_CODE(1519,"識別碼不存在"),
    USER_LINK_IDENTITY_CODE_ERROR(1520,"平台連結錯誤"),
    USER_DEVICE_ID_NO_EQUALS_ERROR(1521,"手機編號不同"),
    USER_IDENTITY_CODE_ALREADY_LINK(1522,"識別碼己綁定"),
    USER_SEARCH_NAME_EXIST(1523,"搜尋名稱己存在"),



    /** Forbidden**/
    FORBIDDEN_INSERT_SUCCESS(1205,"詞庫新增成功"),
    FORBIDDEN_INSERT_FAIL(1206,"詞庫新增失敗"),
    FORBIDDEN_UPDATE_SUCCESS(1207,"詞庫變更成功"),
    FORBIDDEN_UPDATE_FAIL(1208,"詞庫變更失敗"),
    /** ForbiddenSubject**/
    FORBIDDEN_SUBJECT_INSERT_SUCCESS(1209,"詞庫主題新增成功"),
    FORBIDDEN_SUBJECT_INSERT_FAIL(1210,"詞庫主題新增失敗"),
    FORBIDDEN_SUBJECT_UPDATE_SUCCESS(1211,"詞庫主題變更成功"),
    FORBIDDEN_SUBJECT_UPDATE_FAIL(1212,"詞庫主題變更失敗"),
    /** Friend**/
    FRIEND_INSERT_SUCCESS(1301,"新增房間成功"),
    FRIEND_INSERT_FAIL(1302,"新增好友失敗"),
    FRIEND_INSERT_ALREADY(1303,"已提出申請"),
    FRIEND_UPDATE_FAIL(1304,"變更失敗"),
    FRIEND_ALREAY_EXIST(1305,"己是好友關係"),
    FRIEND_LIMIT_MAX(1306,"己超過最多可加數量"),
    /** Room**/
    ROOM_INSERT_SUCCESS(1401,"新增房間成功"),
    ROOM_INSERT_FAIL(1402,"新增房間失敗"),
    ROOM_USER_UPDATE_FAIL(1403,"同意邀請失敗"),
    ROOM_USER_INVITE_FAIL(1404,"邀請失敗"),
    ROOM_USER_INVITE_NOT_ADMIN(1405,"邀請人非管理員"),
    ROOM_TYPE_FAIL(1406,"建立聊天室異常"),
    ROOM_USER_INVITE_MANY_MEMBER(1407,"聊天室人數異常"),
    ROOM_APPLY_INVITE_CODE_WRONG(1408,"邀請碼錯誤"),
    ROOM_APPLY_FAIL(1409,"申請加群失敗"),
    ROOM_UPDATE_FAIL(1410,"更新房間失敗"),
    ROOM_NOT_EXIST(1411,"房間不存在"),
    ROOM_EXIST(1412,"房間己存在"),
    /**Blacklist**/
    BLACKLIST_ROOM_NOT_EXIST(1601,"房間不存在"),
    BLACKLIST_NOT_ADMIN(1602,"非管理者"),
    BLACKLIST_ALREAD_BLOCK(1603,"己在黑名單"),
    BLACKLIST_NOT_EXIST(1604,"無黑名單記錄"),
    BLACKLIST_USER_NOT_EXIST(1605,"使用者不在房間");
    private Integer value;

    private String info;

    public Integer getValue(){
        return this.value;
    }

    public String getInfo(){
        return this.info;
    }

    private StatusEnum(Integer value, String info){
        this.value = value;
        this.info = info;
    }

}
