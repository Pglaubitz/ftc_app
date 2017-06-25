package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
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
        //Sample comment
        driveLeftOne = hMap.dcMotor.get("driveLeftOne");
        driveRightOne = hMap.dcMotor.get("driveRightOne");
    }

    public void moveStraight(float inches)
    {

    }

    public void spin(float degrees)
    {

    }

    public void pivot(float degrees)
    {

    }




}
