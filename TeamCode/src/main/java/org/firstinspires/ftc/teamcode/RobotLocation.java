package org.firstinspires.ftc.teamcode;
/**
* Created byhomefrankfurth on 3/18/22 in FTC-Freight Frenzy.
*
* Copyright (c) ©2022 Kirk Frankfurth
* Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/


public class RobotLocation{
    double angle;

    public RobotLocation(double angle){

        this.angle=angle;
    }
    /*  this is a public class method that returns the heading {so it needs to be within -180 and 180 */
    public double getHeading(){
        double angle = this.angle;
        while (angle< -180){
            angle += 360;
        }
        return angle;
    }
        @Override
    public String toString(){
        return "RobotLocation: angle ("+angle+")";
        }
        public  void turn(double angelChange){
        angle += angelChange;
        }
        public void setAngel(double angle){
        this.angle = angle;
        }

}
