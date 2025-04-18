package com.email.writer.app;


import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Data
public class EmailRequest
{
    private String emailContent;
    private String tone;

}
