package com.guobao.dto.over;

public class LkClientTranLogWithBLOBs extends LkClientTranLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lkclienttranlog.requestContent
     *
     * @mbggenerated Fri Feb 02 17:22:22 CST 2018
     */
    private String requestcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lkclienttranlog.responseContent
     *
     * @mbggenerated Fri Feb 02 17:22:22 CST 2018
     */
    private String responsecontent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lkclienttranlog.requestContent
     *
     * @return the value of lkclienttranlog.requestContent
     *
     * @mbggenerated Fri Feb 02 17:22:22 CST 2018
     */
    public String getRequestcontent() {
        return requestcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lkclienttranlog.requestContent
     *
     * @param requestcontent the value for lkclienttranlog.requestContent
     *
     * @mbggenerated Fri Feb 02 17:22:22 CST 2018
     */
    public void setRequestcontent(String requestcontent) {
        this.requestcontent = requestcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lkclienttranlog.responseContent
     *
     * @return the value of lkclienttranlog.responseContent
     *
     * @mbggenerated Fri Feb 02 17:22:22 CST 2018
     */
    public String getResponsecontent() {
        return responsecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lkclienttranlog.responseContent
     *
     * @param responsecontent the value for lkclienttranlog.responseContent
     *
     * @mbggenerated Fri Feb 02 17:22:22 CST 2018
     */
    public void setResponsecontent(String responsecontent) {
        this.responsecontent = responsecontent;
    }
}