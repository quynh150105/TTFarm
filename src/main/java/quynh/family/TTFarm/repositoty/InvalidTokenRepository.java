package quynh.family.TTFarm.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quynh.family.TTFarm.domain.entity.InvalidatedToken;

@Repository
public interface InvalidTokenRepository extends JpaRepository<InvalidatedToken, String> {
}
