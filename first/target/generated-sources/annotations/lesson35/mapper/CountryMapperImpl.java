package lesson35.mapper;

import javax.annotation.processing.Generated;
import lesson30.model.Country;
import lesson35.dto.CountryDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-02T15:28:19+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CountryMapperImpl implements CountryMapper {

    @Override
    public CountryDto toDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setCode( country.getCode() );
        countryDto.setRussianName( country.getRussianName() );
        countryDto.setEnglishName( country.getEnglishName() );

        return countryDto;
    }

    @Override
    public Country toEntity(CountryDto country) {
        if ( country == null ) {
            return null;
        }

        Country country1 = new Country();

        country1.setCode( country.getCode() );
        country1.setRussianName( country.getRussianName() );
        country1.setEnglishName( country.getEnglishName() );

        return country1;
    }
}
