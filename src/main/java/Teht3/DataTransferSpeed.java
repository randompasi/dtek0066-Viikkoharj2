package Teht3;

public class DataTransferSpeed {

    private Double perSecond;
    private  String prefix;
    private final String endPrefix = "bit/s";

    /**

     * @param perSecond - number value how much is transfered in second
     * @param  prefix - metric unit prefix represent power by ten
     * @.pre prefix != null && perSecond > 0  && perSecond < 10
     * @.post this.perSecond == perSecond && this.prefix.equals(prefix)
     * */

    public DataTransferSpeed (double perSecond, String prefix){
        this.perSecond = perSecond;
        this.prefix = prefix;
    }


}
