#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.io.Serializable;
import lombok.*;

#parse("File Header.java")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ${NAME} implements Serializable{
    private int  
    private String        
    private String        
    private String        
}
