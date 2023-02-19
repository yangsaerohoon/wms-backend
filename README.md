# wms-backend(WIP)

## 개요
- 멀티 모듈 프로젝트로 구성
- 비즈니스 로직과 영속화 부분을 책임지는 모듈
- 외부 시스템에 인터페이스를 제공하는 모듈
- 배치 프로세스를 담당하는 모듈(TBU)
- 기타 유틸리티 모듈

## 모듈 구조
- root
  - 각 프로젝트의 관계를 설정
    - settings.gradle, build.gradle 파일 참고
  - inbound-domain
    - 도메인별 비즈니스 로직과 DB 저장 부분 포함 
  - external-api
    - xxx-domain 모듈의 비즈니스 로직을 사용해 외부의 요청을 처리하는 모듈
    - 외부 시스템에 공개하는 모든 API가 포함됨
    - xxx-domain 모듈에 의존
    ```gradle
    dependencies {
      implementation project(':inbound-domain')
    ...
    ```

## 모듈별 디렉토리 구조
- TBU

## 기타
- TBU

### 로컬 개발 환경용 컨테이너
- docker 디렉토리의 app_local.yaml
- msyql, redis, kafka/zookeeper image 설정이 포함됨
- 로컬 개발을 위해 docker-compose 명령어로 로컬에서 해당 이미지 다운받아 실행
```bash
> docker-compose docker/app_local.yaml up
```
