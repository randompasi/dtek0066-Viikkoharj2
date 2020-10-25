package Teht3;

public class DataTransferSpeed {

    private Double speed;

    /**

     * @param bytes - amount of data transfered in bytes
     * @param seconds - time it took to transfer data
     *   speed is byte on second transfer speed USES  double values
     *                Speed zero if bytes or seconds negative
     *    double    limit 1.7*10^308 - (-1.7*10^308)
     *     over this will cause positive or negative infinty.
     *       ERROR IF DOUBLE ASSIGNED OVER MAX VALUE ON COMPILE TIME
     *
     * @.pre bytes > 0 && seconds > 0
     * @.post speed == bytes/seconds
     */

    public DataTransferSpeed (double bytes, double seconds){
        if(bytes > 0 && seconds > 0) speed = bytes/seconds;
        else speed = 0.0;
    }
}
