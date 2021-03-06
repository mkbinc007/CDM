// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

package com.microsoft.commondatamodel.objectmodel.cdm;

import com.microsoft.commondatamodel.objectmodel.utilities.ResolveOptions;

public interface CdmObjectReference extends CdmObject {

  /**
   * Gets the object reference applied traits.
   */
  CdmTraitCollection getAppliedTraits();

  /**
   * Gets or sets the object explicit reference.
   */
  CdmObjectDefinition getExplicitReference();

  void setExplicitReference(CdmObjectDefinition value);

  /**
   * Gets or sets the object named reference.
   */
  String getNamedReference();

  void setNamedReference(String value);

  /**
   * Gets or sets if the reference is simple named or not. If true use namedReference else use
   * explicitReference.
   */
  boolean isSimpleNamedReference();

  void setSimpleNamedReference(boolean value);

  /**
   *
   * @return
   * @deprecated This function is extremely likely to be removed in the public interface, and not
   * meant to be called externally at all. Please refrain from using it.
   */
  @Deprecated
  default CdmObject fetchResolvedReference() {
    return fetchResolvedReference(new ResolveOptions(this));
  }

  /**
   *
   * @param resOpt
   * @return
   * @deprecated This function is extremely likely to be removed in the public interface, and not
   * meant to be called externally at all. Please refrain from using it.
   */
  @Deprecated
  CdmObject fetchResolvedReference(ResolveOptions resOpt);
}
