// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class DriveTrain extends SubsystemBase {
  private CANSparkMax m_l1;
  private CANSparkMax m_l2;
  private CANSparkMax m_r1;
  private CANSparkMax m_r2;
  private SparkMaxPIDController m_l1PidController;
  private SparkMaxPIDController m_l2PidController;
  private SparkMaxPIDController m_r1PidController;
  private SparkMaxPIDController m_r2PidController;

  /* Motor Data */
  
  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {
    m_l1 = new CANSparkMax(Constants.DriveTrain.CAN_SPKMX_L1, MotorType.kBrushless);
    m_l2 = new CANSparkMax(Constants.DriveTrain.CAN_SPKMX_L2, MotorType.kBrushless);
    m_r1 = new CANSparkMax(Constants.DriveTrain.CAN_SPKMX_R1, MotorType.kBrushless);
    m_r2 = new CANSparkMax(Constants.DriveTrain.CAN_SPKMX_R2, MotorType.kBrushless);
    m_l1PidController = m_l1.getPIDController();
    m_l2PidController = m_l2.getPIDController();
    m_r1PidController = m_r1.getPIDController();
    m_r2PidController = m_r2.getPIDController();
    m_l1.restoreFactoryDefaults();
    m_l2.restoreFactoryDefaults();
    m_r1.restoreFactoryDefaults();
    m_r2.restoreFactoryDefaults();
  }
  public void fbwDrive(double joy_x, double joy_y, double joy_z){
    m_l2.follow(m_l1);
    m_r2.follow(m_r1);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
