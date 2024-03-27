package com.eathub.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MEMBER_TYPE {
  CUSTOMER("CUSTOMER"),
  OWNER("OWNER");

  private final String member_type;
}
