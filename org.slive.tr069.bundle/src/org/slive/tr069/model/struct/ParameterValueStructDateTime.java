package org.slive.tr069.model.struct;

/**
 * TODO Add class comment here<p/>
 * @version 1.0.0
 * @since 1.0.0
 * @author Slive
 * @history<br/>
 * ver date author desc
 * 1.0.0 2013-05-21 Slive created<br/>
 * <p/>
 */
public final class ParameterValueStructDateTime extends ParameterValueStruct<String>
{
    private static final long serialVersionUID = 8383736136511239623L;

    /**
     * 表示为UTC（全球统一时间）
     * 2天3小时4分5秒将表示为0000-00-02T03:04:05
     * @param name
     * @param value
     */
    public ParameterValueStructDateTime(String name, String value)
    {
        super(name, value, Type_DateTime);
    }
}
