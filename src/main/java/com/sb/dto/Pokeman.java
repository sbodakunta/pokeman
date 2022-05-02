package com.sb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * <p>Title: $[Name]</p>
 *
 * <p>Description: TODO</p>
 *
 * <p>Copyright: copyright (c) 2021</p>
 * <p>Company: Perosnal</p>
 *
 * @author Shankar Bodakunta
 */
@Data
@JsonIgnoreProperties
public class Pokeman {

    private String id;
    private Sprites sprites;
    private String name;
}
