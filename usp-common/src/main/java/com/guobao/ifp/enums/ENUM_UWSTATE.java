package com.guobao.ifp.enums;

/**
 * 
 * 【核保状态】
 * @author gbifp
 * @date 2018年3月16日 下午5:53:22 
 * @version V1.0
 */
public enum ENUM_UWSTATE {
	uwstate1("1","拒保"),
	uwstate2("2","延期"),
	uwstate3("3","加费承保"),
	uwstate4("4","特约承保"),
	uwstate5("5","未通过自动核保"),
	uwstate9("9","标准承保"),
	uwstateA("a","撤保"),
	uwstateZ("z","核保订正");
    private final String code;
    private final String desc;

    ENUM_UWSTATE(String code ,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String code() {
        return code;
    }

    public String desc() {
        return desc;
    }
    /**
     * 根据key获得desc
     * @param key
     * @return
     */
    public static String getEnumDescByKey(String key){
        for(ENUM_UWSTATE enumItem:ENUM_UWSTATE.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
