#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.Info;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

#parse("File Header.java")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ${Name}Action extends ActionSupport implements ModelDriven<Object>, ParameterAware, RequestAware {

    private Object model;
    private Map<String, String[]> parameters;
    Map<String, Object> session;


    /**
    * 根据页面的隐藏参数 model 决定模型实际类型,再进行自动填充数据
    */
    @Override
    public Object getModel() {
    String modelStr = parameters.get("model")[0];
    model = new ${Model}();

    return model;
    }

    @Override    public void setParameters(Map    <String    , String[]> parameters) {    this.parameters = parameters;    }
    @Override    @SuppressWarnings("unchecked")    public void setRequest(Map    <String    , Object> map) {    this.session = (Map    <String    , Object>) map.get("session");    }    
}





























