package com.tuya.connector.open.ability.linkage.model.request;

import com.tuya.connector.open.ability.linkage.model.Action;
import com.tuya.connector.open.ability.linkage.model.Condition;
import lombok.Data;

import java.util.List;

/**
 * LinkageAddRequest
 *
 * @author jwsong
 * @since 2022/10/31 2:49 下午
 */
@Data
public class LinkageModifyRequest {
    private String spaceId;
    private String name;
    private String type;
    private String decisionExpr;
    private List<Condition> conditions;
    private List<Action> actions;
    private String effectiveTime;
}