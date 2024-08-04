package es.fercbrt.srpingbooterrorshandler.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Error {
    private String message;
    private String error;
    private int status;
    private Date date;
}
