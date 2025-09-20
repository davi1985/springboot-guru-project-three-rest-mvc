package sarahcode.springframework.restmvc.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import sarahcode.springframework.restmvc.model.Beer;

@Mapper(componentModel = "spring")
public interface BeerMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateBeerFromDto(Beer source, @MappingTarget Beer target);

    @Condition
    default boolean isNotBlank(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
