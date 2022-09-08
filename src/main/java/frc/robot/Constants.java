// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final class DriveTrain{
        public static final int CAN_SPKMX_L1 = 1;
        public static final int CAN_SPKMX_L2 = 2;
        public static final int CAN_SPKMX_R1 = 3;
        public static final int CAN_SPKMX_R2 = 4;
    }
    public final class MotorSpecs{
        /*Falcon 500 Specs*/
        public static final int FALCON_ENC_RES = 2048;
        public static final int FALCON_MAX_RPM = 6380;
        /*NEO Specs*/
        public static final int NEO_ENC_RES = 42;
        public static final double NEO_kP = 6e-5; 
        public static final double NEO_kI = 0;
        public static final double NEO_kD = 0; 
        public static final double NEO_kIz = 0; 
        public static final double NEO_kFF = 0.000015; 
        public static final double NEO_kMaxOutput = 1; 
        public static final double NEO_kMinOutput = -1;
        public static final double  NEO_maxRPM = 5700;
    }
    public final class Controls{
        public static final int JOYSTICK_USB = 0;

    }
}
