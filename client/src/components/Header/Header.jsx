import logo from '../../img/logo.png';

function Header() {
  return (
    <nav
      className="navbar bg-dark navbar-expand-lg fixed-top"
      data-bs-theme="dark"
    >
      <div className="container-fluid">
        <a className="navbar-brand" href="/">
          <img src={logo} alt="logo" height="40px" />
        </a>

        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item">
              <a className="nav-link active" aria-current="page" href="/">
                쇼츠
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/destination">
                지역
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/season">
                season
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/guide">
                가이드
              </a>
            </li>
          </ul>
        </div>

        <form className="d-flex me-5" role="search">
          <input
            className="form-control me-2"
            type="search"
            placeholder="검색하기"
            aria-label="Search"
          />
          <button className="btn btn-outline-secondary" type="submit">
            Search
          </button>
        </form>
        <form className="justify-content-end">
          <button className="btn btn-outline-light me-2" type="button">
            로그인
          </button>
          <button className="btn btn-outline-info" type="button">
            회원가입
          </button>
        </form>
      </div>
    </nav>
  );
}

export default Header;
