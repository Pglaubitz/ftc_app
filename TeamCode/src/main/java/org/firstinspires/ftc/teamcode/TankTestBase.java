package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by 111 on 6/11/2017.
 */

public class TankTestBase implements TestInterface
{
    private DcMotor driveLeftOne = null;
    private DcMotor driveRightOne = null;
    public void init(HardwareMap hMap)
    {
     driveLeftOne = hMap.get("driveLeftOne"); //Motors need to be named inside the app
     driveRightOne = hMap.get("driveRightOne");
    }

    public void driveStraight(float inches)
    {

    }

    public void spin(float degrees)
    {

    }

    public void pivot(float degrees)
    {

    }




}
