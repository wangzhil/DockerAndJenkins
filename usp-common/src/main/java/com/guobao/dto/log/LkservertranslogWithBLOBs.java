package com.guobao.dto.log;

public class LkservertranslogWithBLOBs extends Lkservertranslog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lkservertranslog.requestContent
     *
     * @mbg.generated Sun Apr 01 19:17:40 CST 2018
     */
    private String requestcontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lkservertranslog.responseContent
     *
     * @mbg.generated Sun Apr 01 19:17:40 CST 2018
     */
    private String responsecontent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lkservertranslog.requestContent
     *
     * @return the value of lkservertranslog.requestContent
     *
     * @mbg.generated Sun Apr 01 19:17:40 CST 2018
     */
    public String getRequestcontent() {
        return requestcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lkservertranslog.requestContent
     *
     * @param requestcontent the value for lkservertranslog.requestContent
     *
     * @mbg.generated Sun Apr 01 19:17:40 CST 2018
     */
    public void setRequestcontent(String requestcontent) {
        this.requestcontent = requestcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lkservertranslog.responseContent
     *
     * @return the value of lkservertranslog.responseContent
     *
     * @mbg.generated Sun Apr 01 19:17:40 CST 2018
     */
    public String getResponsecontent() {
        return responsecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lkservertranslog.responseContent
     *
     * @param responsecontent the value for lkservertranslog.responseContent
     *
     * @mbg.generated Sun Apr 01 19:17:40 CST 2018
     */
    public void setResponsecontent(String responsecontent) {
        this.responsecontent = responsecontent;
    }
}