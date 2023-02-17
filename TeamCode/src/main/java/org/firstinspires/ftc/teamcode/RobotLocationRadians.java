package org.firstinspires.ftc.teamcode;
/**
* Created by homefrankfurth on 3/18/22 in FTC-Freight Frenzy.
*
* Copyright (c) ©2022 Kirk Frankfurth
* Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/


public  class RobotLocationRadians   {
    double angleRadians;

    public RobotLocationRadians(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }

    public double getHeading(){
        double angle = this.angleRadians;
        while (angle > Math.PI ){
            angle -= 2 * Math.PI;
        }
        while (angle < -Math.PI){
            angle += 2 * Math.PI;
        }
        return Math.toDegrees(angle);
    }
    @Override
    public String toString(){
        return "RobotLocationRadians: angle ("+angleRadians+")";
    }
    public void turn(double angleChangeDegrees){
        angleRadians += Math.toRadians(angleChangeDegrees);
    }
    public void  setAngle(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }
}
