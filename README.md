# 미세먼지 앱
playstore : https://play.google.com/store/apps/details?id=org.techtown.airpollutionpublicapiapp

에어코리아 open api를 활용한 미세먼지 앱 입니다.

# 사용 open api

한국환경공단_에어코리아_측정소정보 : https://www.data.go.kr/data/15073877/openapi.do

한국환경공단_에어코리아_대기오염정보 : https://www.data.go.kr/data/15073861/openapi.do
 
위도,경도 tm좌표로 변환 : https://developers.kakao.com/docs/latest/ko/local/dev-guide#trans-coord

# 동작 과정
사용자 위치정보 수집 -> 카카오developers api를 활용해 위도,경도 좌표를 tm좌표로 변경 ->

tm좌표로 근접측정소 목록 정보 얻어오기 -> 가져온 측정소 정보로 측정소별 실시간 측정정보 얻어오기 

![image](https://user-images.githubusercontent.com/86578252/176222013-6c18bdf8-22c0-4108-92a2-00ff395bf7b4.png)



