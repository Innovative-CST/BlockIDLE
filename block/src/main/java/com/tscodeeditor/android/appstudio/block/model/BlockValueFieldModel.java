/*
 * This file is part of Android AppStudio [https://github.com/TS-Code-Editor/AndroidAppStudio].
 *
 * License Agreement
 * This software is licensed under the terms and conditions outlined below. By accessing, copying, modifying, or using this software in any way, you agree to abide by these terms.
 *
 * 1. **  Copy and Modification Restrictions  **
 *    - You are not permitted to copy or modify the source code of this software without the permission of the owner, which may be granted publicly on GitHub Discussions or on Discord.
 *    - If permission is granted by the owner, you may copy the software under the terms specified in this license agreement.
 *    - You are not allowed to permit others to copy the source code that you were allowed to copy by the owner.
 *    - Modified or copied code must not be further copied.
 * 2. **  Contributor Attribution  **
 *    - You must attribute the contributors by creating a visible list within the application, showing who originally wrote the source code.
 *    - If you copy or modify this software under owner permission, you must provide links to the profiles of all contributors who contributed to this software.
 * 3. **  Modification Documentation  **
 *    - All modifications made to the software must be documented and listed.
 *    - the owner may incorporate the modifications made by you to enhance this software.
 * 4. **  Consistent Licensing  **
 *    - All copied or modified files must contain the same license text at the top of the files.
 * 5. **  Permission Reversal  **
 *    - If you are granted permission by the owner to copy this software, it can be revoked by the owner at any time. You will be notified at least one week in advance of any such reversal.
 *    - In case of Permission Reversal, if you fail to acknowledge the notification sent by us, it will not be our responsibility.
 * 6. **  License Updates  **
 *    - The license may be updated at any time. Users are required to accept and comply with any changes to the license.
 *    - In such circumstances, you will be given 7 days to ensure that your software complies with the updated license.
 *    - We will not notify you about license changes; you need to monitor the GitHub repository yourself (You can enable notifications or watch the repository to stay informed about such changes).
 * By using this software, you acknowledge and agree to the terms and conditions outlined in this license agreement. If you do not agree with these terms, you are not permitted to use, copy, modify, or distribute this software.
 *
 * Copyright © 2024 Dev Kumar
 */

package com.tscodeeditor.android.appstudio.block.model;

import java.io.Serializable;

public class BlockValueFieldModel extends BlockFieldModel implements Serializable, Cloneable {
  public static final long serialVersionUID = 11L;

  private boolean enableEdit;
  private String replacer;
  private String rawCode;
  private String acceptors[];
  private BlockModel blockModel;
  private int editorType;
  private String pattern; // Only works if onClick is pattern validator editor

  public String[] getAcceptors() {
    return this.acceptors;
  }

  public void setAcceptors(String[] acceptors) {
    this.acceptors = acceptors;
  }

  public boolean isEnabledEdit() {
    return this.enableEdit;
  }

  public void setEnableEdit(boolean enableEdit) {
    this.enableEdit = enableEdit;
  }

  public String getReplacer() {
    return this.replacer;
  }

  public void setReplacer(String replacer) {
    this.replacer = replacer;
  }

  public String getRawCode() {
    return this.rawCode;
  }

  public void setRawCode(String rawCode) {
    this.rawCode = rawCode;
  }

  public BlockModel getBlockModel() {
    return this.blockModel;
  }

  public void setBlockModel(BlockModel blockModel) {
    this.blockModel = blockModel;
  }

  public int getEditorType() {
    return this.editorType;
  }

  public void setEditorType(int editorType) {
    this.editorType = editorType;
  }

  public String getPattern() {
    return this.pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  @Override
  public BlockValueFieldModel clone() {
    BlockValueFieldModel blockValueFieldModel = new BlockValueFieldModel();
    blockValueFieldModel.setValue(getValue() != null ? new String(getValue()) : "");
    blockValueFieldModel.setReplacer(getReplacer() != null ? new String(getReplacer()) : "");
    blockValueFieldModel.setEnableEdit(new Boolean(isEnabledEdit()));
    blockValueFieldModel.setRawCode(getRawCode() != null ? new String(getRawCode()) : "");
    blockValueFieldModel.setBlockModel(getBlockModel().clone() != null ? getBlockModel() : null);
    blockValueFieldModel.setEditorType(new Integer(getEditorType()));
    blockValueFieldModel.setPattern(getPattern() != null ? new String(getPattern()) : "");
    if (getAcceptors() != null) {
      String[] acceptors = new String[] {};

      for (int position = 0; position < getAcceptors().length; ++position) {
        acceptors[position] = new String(getAcceptors()[position]);
      }
      blockValueFieldModel.setAcceptors(acceptors);
    }
    return blockValueFieldModel;
  }
}
