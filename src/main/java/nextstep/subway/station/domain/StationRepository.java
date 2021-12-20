package nextstep.subway.station.domain;

import java.util.List;
import nextstep.subway.common.PageRequestPerform;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StationRepository extends JpaRepository<Station, Long> {


    <T extends PageRequestPerform> List<Station> findStationAll(T pageable, Long position);
}