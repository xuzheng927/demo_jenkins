package com.cloud.hystrix.bean;

import lombok.ToString;

import java.util.List;

/**
 * @类名: JsonData
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/22 18:16
 * @修改人及修改时间：
 * @版本 1.0
 */
@ToString
public class JsonData {

    /**
     * hits : {"hits":[{"_source":{"lab339":30,"lab268":"0","lab466":"0","lab499":"2-2A8C1KBS","lab498":"一个月","lab497":"0","lab464":"0","lab463":"2019-02-01 00:00:00","lab496":"","lab474":0.44,"lab374":"-1","lab14":"201802-翼企享福30元畅享套餐","lab13":"2-2A8C1KBS","lab1":"19901670172"}}],"total":1}
     * timed_out : false
     */

    private HitsBeanX hits;
    private boolean timed_out;

    public HitsBeanX getHits() {
        return hits;
    }

    public void setHits(HitsBeanX hits) {
        this.hits = hits;
    }

    public boolean isTimed_out() {
        return timed_out;
    }

    public void setTimed_out(boolean timed_out) {
        this.timed_out = timed_out;
    }
    @ToString
    public static class HitsBeanX {
        /**
         * hits : [{"_source":{"lab339":30,"lab268":"0","lab466":"0","lab499":"2-2A8C1KBS","lab498":"一个月","lab497":"0","lab464":"0","lab463":"2019-02-01 00:00:00","lab496":"","lab474":0.44,"lab374":"-1","lab14":"201802-翼企享福30元畅享套餐","lab13":"2-2A8C1KBS","lab1":"19901670172"}}]
         * total : 1
         */

        private int total;
        private List<HitsBean> hits;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<HitsBean> getHits() {
            return hits;
        }

        public void setHits(List<HitsBean> hits) {
            this.hits = hits;
        }
        @ToString
        public static class HitsBean {
            /**
             * _source : {"lab339":30,"lab268":"0","lab466":"0","lab499":"2-2A8C1KBS","lab498":"一个月","lab497":"0","lab464":"0","lab463":"2019-02-01 00:00:00","lab496":"","lab474":0.44,"lab374":"-1","lab14":"201802-翼企享福30元畅享套餐","lab13":"2-2A8C1KBS","lab1":"19901670172"}
             */

            private SourceBean _source;

            public SourceBean get_source() {
                return _source;
            }

            public void set_source(SourceBean _source) {
                this._source = _source;
            }
            @ToString
            public static class SourceBean {
                /**
                 * lab339 : 30
                 * lab268 : 0
                 * lab466 : 0
                 * lab499 : 2-2A8C1KBS
                 * lab498 : 一个月
                 * lab497 : 0
                 * lab464 : 0
                 * lab463 : 2019-02-01 00:00:00
                 * lab496 :
                 * lab474 : 0.44
                 * lab374 : -1
                 * lab14 : 201802-翼企享福30元畅享套餐
                 * lab13 : 2-2A8C1KBS
                 * lab1 : 19901670172
                 */

                private int lab339;
                private String lab268;
                private String lab466;
                private String lab499;
                private String lab498;
                private String lab497;
                private String lab464;
                private String lab463;
                private String lab496;
                private double lab474;
                private String lab374;
                private String lab14;
                private String lab13;
                private String lab1;

                public int getLab339() {
                    return lab339;
                }

                public void setLab339(int lab339) {
                    this.lab339 = lab339;
                }

                public String getLab268() {
                    return lab268;
                }

                public void setLab268(String lab268) {
                    this.lab268 = lab268;
                }

                public String getLab466() {
                    return lab466;
                }

                public void setLab466(String lab466) {
                    this.lab466 = lab466;
                }

                public String getLab499() {
                    return lab499;
                }

                public void setLab499(String lab499) {
                    this.lab499 = lab499;
                }

                public String getLab498() {
                    return lab498;
                }

                public void setLab498(String lab498) {
                    this.lab498 = lab498;
                }

                public String getLab497() {
                    return lab497;
                }

                public void setLab497(String lab497) {
                    this.lab497 = lab497;
                }

                public String getLab464() {
                    return lab464;
                }

                public void setLab464(String lab464) {
                    this.lab464 = lab464;
                }

                public String getLab463() {
                    return lab463;
                }

                public void setLab463(String lab463) {
                    this.lab463 = lab463;
                }

                public String getLab496() {
                    return lab496;
                }

                public void setLab496(String lab496) {
                    this.lab496 = lab496;
                }

                public double getLab474() {
                    return lab474;
                }

                public void setLab474(double lab474) {
                    this.lab474 = lab474;
                }

                public String getLab374() {
                    return lab374;
                }

                public void setLab374(String lab374) {
                    this.lab374 = lab374;
                }

                public String getLab14() {
                    return lab14;
                }

                public void setLab14(String lab14) {
                    this.lab14 = lab14;
                }

                public String getLab13() {
                    return lab13;
                }

                public void setLab13(String lab13) {
                    this.lab13 = lab13;
                }

                public String getLab1() {
                    return lab1;
                }

                public void setLab1(String lab1) {
                    this.lab1 = lab1;
                }
            }
        }
    }
}
