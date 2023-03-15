// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.GrabberSubsystem;
import edu.wpi.first.wpilibj2.command.InstantCommand;

/** A command that releases the hatch. */
public class GrabberOpen extends InstantCommand {
  public GrabberOpen(GrabberSubsystem subsystem) {
    super(subsystem::releaseGamePiece, subsystem);
  }
}
