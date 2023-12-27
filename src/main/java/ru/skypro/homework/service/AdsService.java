package ru.skypro.homework.service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.CustomUserDetails;
import ru.skypro.homework.dto.*;

public interface AdsService {
    Ads getAllAds();
    Ad addAd (CreateOrUpdateAd properties, MultipartFile image, CustomUserDetails userDetails);
    ExtendedAd getAds(Integer adId);
    void removeAd(Integer adId,CustomUserDetails userDetails);
    CreateOrUpdateAd updateAd(Integer adId, CreateOrUpdateAd properties, CustomUserDetails userDetails);
    Ads getAdsMe(CustomUserDetails userDetails);
    void updateImage(Integer adId, MultipartFile image, CustomUserDetails userDetails);

}
